// DOM Elements
const todoForm = document.getElementById('todo-form');
const taskInput = document.getElementById('task-input');
const categorySelect = document.getElementById('category-select');
const taskList = document.getElementById('task-list');
const filterButtons = document.querySelectorAll('.filter-btn');

// Task data structure
let tasks = [];
let currentFilter = 'all';
let draggedItem = null;

// Load tasks from localStorage
function loadTasks() {
    const savedTasks = localStorage.getItem('tasks');
    if (savedTasks) {
        tasks = JSON.parse(savedTasks);
        renderTasks();
    }
}

// Save tasks to localStorage
function saveTasks() {
    localStorage.setItem('tasks', JSON.stringify(tasks));
}

// Generate a unique ID for each task
function generateID() {
    return Date.now().toString();
}

// Add a new task
function addTask(text, category) {
    // Create a new task object with various properties
    const newTask = {
        id: generateID(),           // Unique identifier for the task
        text: text,                 // The task description entered by the user
        category: category,         // The selected category (Work, Personal, etc.)
        completed: false,           // Initial completion status
        createdAt: new Date()       // Timestamp for sorting and reference
    };

    // Add the new task to our tasks array
    tasks.push(newTask);

    // Persist to localStorage so data remains after page refresh
    saveTasks();

    // Update the UI to show the new task
    renderTasks();
}

// Delete a task
function deleteTask(id) {
    // Filter out the task with the matching ID
    tasks = tasks.filter(task => task.id !== id);

    // Update localStorage and UI
    saveTasks();
    renderTasks();
}

// Toggle task completion status
function toggleTaskCompletion(id) {
    // Find the specific task by ID
    const task = tasks.find(task => task.id === id);

    if (task) {
        // Toggle the completed status (true becomes false, false becomes true)
        task.completed = !task.completed;

        // Update localStorage and UI
        saveTasks();
        renderTasks();
    }
}

// Update an existing task
function updateTask(id, newText, newCategory) {
    // Find the specific task by ID
    const task = tasks.find(task => task.id === id);

    if (task) {
        // Update the task properties with new values
        task.text = newText;
        task.category = newCategory;

        // Update localStorage and UI
        saveTasks();
        renderTasks();
    }
}

// Filter tasks based on category or completion status
function filterTasks(filter) {
    // Store the current filter selection
    currentFilter = filter;

    // Re-render the task list with the new filter applied
    renderTasks();

    // Update the active state of filter buttons in the UI
    filterButtons.forEach(btn => {
        if (btn.dataset.filter === filter) {
            btn.classList.add('active');
        } else {
            btn.classList.remove('active');
        }
    });
}

// Render tasks to the DOM
function renderTasks() {
    // Clear the existing task list in the UI
    taskList.innerHTML = '';

    // Apply filtering based on the current filter selection
    let filteredTasks = tasks;

    if (currentFilter === 'completed') {
        // Show only completed tasks
        filteredTasks = tasks.filter(task => task.completed);
    } else if (currentFilter !== 'all') {
        // Show tasks of a specific category
        filteredTasks = tasks.filter(task => task.category === currentFilter);
    }

    // Sort tasks by creation date (newest first)
    filteredTasks.sort((a, b) => new Date(b.createdAt) - new Date(a.createdAt));

    // Render each task in the filtered list
    filteredTasks.forEach(task => {
        // Create a list item for the task
        const taskItem = document.createElement('li');
        taskItem.classList.add('task-item');
        taskItem.dataset.id = task.id;
        taskItem.dataset.category = task.category;

        // Add completion status class if needed
        if (task.completed) {
            taskItem.classList.add('task-complete');
        }

        // Populate the task item with content and controls
        taskItem.innerHTML = `
            <div class="task-content">
                <input type="checkbox" class="task-checkbox" ${task.completed ? 'checked' : ''}>
                <span class="task-text">${task.text}</span>
                <span class="task-category category-${task.category}">${task.category}</span>
            </div>
            <div class="task-actions">
                <button class="edit-btn">Edit</button>
                <button class="delete-btn">Delete</button>
            </div>
        `;

        // Set up checkbox event listener for toggling completion
        const checkbox = taskItem.querySelector('.task-checkbox');
        checkbox.addEventListener('change', () => {
            toggleTaskCompletion(task.id);
        });

        // Set up edit button event listener
        const editBtn = taskItem.querySelector('.edit-btn');
        editBtn.addEventListener('click', () => {
            // Check if we're already editing this task
            if (taskItem.querySelector('.edit-form')) {
                return;
            }

            // Create an edit form for inline editing
            const editForm = document.createElement('div');
            editForm.classList.add('edit-form');
            editForm.innerHTML = `
                <input type="text" class="edit-input" value="${task.text}">
                <select class="edit-category">
                    <option value="Work" ${task.category === 'Work' ? 'selected' : ''}>Work</option>
                    <option value="Personal" ${task.category === 'Personal' ? 'selected' : ''}>Personal</option>
                    <option value="Urgent" ${task.category === 'Urgent' ? 'selected' : ''}>Urgent</option>
                    <option value="Other" ${task.category === 'Other' ? 'selected' : ''}>Other</option>
                </select>
                <button class="save-btn">Save</button>
                <button class="cancel-btn">Cancel</button>
            `;

            // Add the edit form to the task item
            taskItem.appendChild(editForm);

            // Focus on the input for immediate editing
            const editInput = editForm.querySelector('.edit-input');
            editInput.focus();

            // Set up save and cancel button event listeners
            const saveBtn = editForm.querySelector('.save-btn');
            const cancelBtn = editForm.querySelector('.cancel-btn');

            saveBtn.addEventListener('click', () => {
                const newText = editInput.value.trim();
                const newCategory = editForm.querySelector('.edit-category').value;

                if (newText !== '') {
                    updateTask(task.id, newText, newCategory);
                }
            });

            cancelBtn.addEventListener('click', () => {
                editForm.remove();
            });
        });

        // Set up delete button event listener
        const deleteBtn = taskItem.querySelector('.delete-btn');
        deleteBtn.addEventListener('click', () => {
            if (confirm("Are you sure you want to delete this task?")) {
                deleteTask(task.id);
            }
        });

        // Set up drag and drop functionality
        taskItem.setAttribute('draggable', 'true');

        taskItem.addEventListener('dragstart', function() {
            draggedItem = this;
            setTimeout(() => this.classList.add('dragging'), 0);
        });

        taskItem.addEventListener('dragend', function() {
            this.classList.remove('dragging');
            draggedItem = null;
        });

        // Add the completed task item to the task list
        taskList.appendChild(taskItem);
    });
}

// Handle form submission for adding new tasks
todoForm.addEventListener('submit', function(e) {
    e.preventDefault();

    const text = taskInput.value.trim();
    const category = categorySelect.value;

    if (text !== '') {
        addTask(text, category);
        taskInput.value = '';  // Clear the input field after adding
    }
});

// Handle filter button clicks
filterButtons.forEach(button => {
    button.addEventListener('click', () => {
        filterTasks(button.dataset.filter);
    });
});

// Handle drag and drop functionality for the task list
taskList.addEventListener('dragover', function(e) {
    e.preventDefault();
    const afterElement = getDragAfterElement(this, e.clientY);

    if (afterElement == null) {
        // If there's no element after, append to the end
        this.appendChild(draggedItem);
    } else {
        // Otherwise insert before the calculated element
        this.insertBefore(draggedItem, afterElement);
    }

    // Update the task order in the data structure
    updateTaskOrder();
});

// Helper function to determine where to place the dragged element
function getDragAfterElement(container, y) {
    // Get all draggable elements except the one being dragged
    const draggableElements = [...container.querySelectorAll('.task-item:not(.dragging)')];

    // Find the element to place after based on mouse position
    return draggableElements.reduce((closest, child) => {
        const box = child.getBoundingClientRect();
        const offset = y - box.top - box.height / 2;

        // We want the closest element that's above our cursor
        if (offset < 0 && offset > closest.offset) {
            return { offset: offset, element: child };
        } else {
            return closest;
        }
    }, { offset: Number.NEGATIVE_INFINITY }).element;
}

// Update task order in the data structure after drag and drop
function updateTaskOrder() {
    const taskItems = document.querySelectorAll('.task-item');
    const newTasksOrder = [];

    // Build a new array with tasks in the order they appear in the DOM
    taskItems.forEach(item => {
        const taskId = item.dataset.id;
        const task = tasks.find(t => t.id === taskId);

        if (task) {
            newTasksOrder.push(task);
        }
    });

    // Only update if all tasks are visible (not filtered)
    if (currentFilter === 'all' && newTasksOrder.length === tasks.length) {
        tasks = newTasksOrder;
        saveTasks();
    }
}

// Initialize the application by loading saved tasks
loadTasks();