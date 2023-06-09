window.onload = function() {
    selectedItemText.textContent = "Helmet"; // Set initial selected item to "Helmet"
    updateHelmetImage("")
};

// Get the elements
var dropdownContent = document.getElementById("dropdown-content");
var searchInput = document.getElementById("search-input");
var selectedItemText = document.getElementById("selected-item-text");

// Function to toggle the dropdown
function toggleDropdown() {
    dropdownContent.classList.toggle("show");
}

// Function to filter the items based on search input
function filterItems() {
    var input = searchInput.value.toLowerCase();
    var items = dropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

function selectItem(itemText, imageUrl) {
    selectedItemText.textContent = itemText;
    toggleDropdown();
    updateHelmetImage(imageUrl);
}

function selectItem(itemText, imageUrl) {
    selectedItemText.textContent = itemText;
    toggleDropdown();
    updateHelmetImage(imageUrl);
}

function updateHelmetImage(imageUrl) {
    var helmetImage = document.getElementById("helmet-image");
    var helmetLink = document.getElementById("helmet-link");
    var equipmentHead = document.getElementById("equipment-head");
    var equipmentPlinkp = document.getElementById("equipment-plinkp");

    helmetImage.src = imageUrl;
    helmetLink.href = "https://oldschool.runescape.wiki/w/" + selectedItemText.textContent.replace(/\s+/g, "_");

    if (selectedItemText.textContent === "Helmet") {
        equipmentHead.classList.remove("equipment-blank");
        equipmentPlinkp.style.display = "none";
    } else {
        equipmentHead.classList.add("equipment-blank");
        equipmentPlinkp.style.display = "flex";
    }
}

fetch('/api/helmets') // Update the URL to match your controller endpoint
    .then(response => response.json())
    .then(items => {
        console.log('Items retrieved:', items);

        const itemList = document.getElementById('item-list');
        itemList.innerHTML = ''; // Clear the existing dropdown items

        items.forEach(item => {
            const link = document.createElement('a');
            link.href = '#';
            link.textContent = item.name;
            link.onclick = () => selectItem(item.name, item.imageUrl);

            const itemDiv = document.createElement('div');
            itemDiv.appendChild(link);
            itemList.appendChild(itemDiv);
        });

        console.log('Dropdown menu populated:', items);
    })
    .catch(error => {
        console.error('Error retrieving items:', error);
    });

