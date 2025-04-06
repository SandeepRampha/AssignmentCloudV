const input = document.querySelector('.add input');
const button = document.querySelector('.add button');
const list = document.querySelector('.list');

    button.addEventListener('click', () => {
        const taskText = input.value.trim();

        if (taskText !== '') {
            // Create task item
            const task = document.createElement('div');
            task.className = 'task';
            task.innerHTML = `
                <span>${taskText}</span>
                <button class="delete-btn">Delete</button>
            `;

            list.appendChild(task);
            input.value = '';
        }
    });

    list.addEventListener('click', (e) => {
        if (e.target.classList.contains('delete-btn')) {
            e.target.parentElement.remove();
        }
    });