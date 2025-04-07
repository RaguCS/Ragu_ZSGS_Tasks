document.getElementById('search-input').addEventListener('input', function () {
    const query = this.value.trim();
    if (query.length > 2) {
        fetchMeals(query);
    }
});

function fetchMeals(query) {
    fetch(`https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`)
        .then(res => res.json())
        .then(data => displayMeals(data.meals))
        .catch(err => console.error('Error:', err));
}

function displayMeals(meals) {
    const container = document.getElementById('meals-container');
    container.innerHTML = '';
    document.getElementById('meal-details').classList.add('hidden');

    if (!meals) {
        container.innerHTML = '<p>No meals found.</p>';
        return;
    }

    meals.forEach(meal => {
        const card = document.createElement('div');
        card.className = 'meal-card';
        card.innerHTML = `
      <img src="${meal.strMealThumb}" alt="${meal.strMeal}" />
      <h3>${meal.strMeal}</h3>
    `;
        card.addEventListener('click', () => showMealDetails(meal));
        container.appendChild(card);
    });
}

function showMealDetails(meal) {
    const details = document.getElementById('meal-details');
    details.classList.remove('hidden');

    const ingredients = [];
    for (let i = 1; i <= 20; i++) {
        const ing = meal[`strIngredient${i}`];
        const measure = meal[`strMeasure${i}`];
        if (ing && ing.trim()) {
            ingredients.push(`${ing} - ${measure}`);
        }
    }

    details.innerHTML = `
    <h2>${meal.strMeal}</h2>
    <img src="${meal.strMealThumb}" style="width:100%; max-width:400px;"/>
    <h3>Ingredients</h3>
    <ul>${ingredients.map(i => `<li>${i}</li>`).join('')}</ul>
    <h3>Instructions</h3>
    <p>${meal.strInstructions}</p>
    <a href="${meal.strYoutube}" target="_blank">📺 Watch on YouTube</a>
  `;
}
