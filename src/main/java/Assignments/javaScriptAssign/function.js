let expenses = [];

function addExpense() {
    let desc = document.getElementById('desc').value;
    let amount = parseFloat(document.getElementById('amount').value);
    if (desc && amount) {
        expenses.push({ desc, amount });
        updateExpenses();
    }
}

function updateExpenses() {
    let list = document.getElementById('expense-list');
    let total = 0;
    list.innerHTML = '';
    expenses.forEach((expense, index) => {
        total += expense.amount;
        let li = document.createElement('li');
        li.innerHTML = `${expense.desc} - $${expense.amount} 
            <button onclick="editExpense(${index})">Edit</button>
            <button onclick="deleteExpense(${index})">X</button>`;
        list.appendChild(li);
    });
    document.getElementById('total').innerText = total;
}

function deleteExpense(index) {
    expenses.splice(index, 1);
    updateExpenses();
}

function editExpense(index) {
    let newDesc = prompt("Enter new description:", expenses[index].desc);
    let newAmount = parseFloat(prompt("Enter new amount:", expenses[index].amount));
    if (newDesc && !isNaN(newAmount)) {
        expenses[index] = { desc: newDesc, amount: newAmount };
        updateExpenses();
    }
}
