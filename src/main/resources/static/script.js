window.onload = function() {
    // Set initial selected item to "Helmet" and "Amulet"
    selectedHelmetText.textContent = "Helmet";
    selectedAmuletText.textContent = "Amulet";

    updateHelmetImage("");
    updateAmuletImage("");
};

// Get the elements for the helmet dropdown
var helmetDropdownContent = document.getElementById("helmet-dropdown-content");
var helmetSearchInput = document.getElementById("helmet-search-input");
var selectedHelmetText = document.getElementById("selected-helmet-text");

// Get the elements for the amulet dropdown
var amuletDropdownContent = document.getElementById("amulet-dropdown-content");
var amuletSearchInput = document.getElementById("amulet-search-input");
var selectedAmuletText = document.getElementById("selected-amulet-text");

// Function to toggle the helmet dropdown
function toggleHelmetDropdown() {
    helmetDropdownContent.classList.toggle("show");
}

// Function to filter the helmet items based on search input
function filterHelmetItems() {
var input = helmetSearchInput.value.toLowerCase();
var items = helmetDropdownContent.getElementsByTagName("a");

for (var i = 0; i < items.length; i++) {
    var itemText = items[i].textContent.toLowerCase();
    if (itemText.indexOf(input) > -1) {
    items[i].style.display = "";
    } else {
    items[i].style.display = "none";
    }
}
}

// Function to select a helmet item
function selectHelmetItem(itemText, imageUrl) {
    selectedHelmetText.textContent = itemText;
    toggleHelmetDropdown();
    updateHelmetImage(imageUrl);
}

// Function to toggle the amulet dropdown
function toggleAmuletDropdown() {
    amuletDropdownContent.classList.toggle("show");
}

// Function to filter the amulet items based on search input
function filterAmuletItems() {
    var input = amuletSearchInput.value.toLowerCase();
    var items = amuletDropdownContent.getElementsByTagName("a");

for (var i = 0; i < items.length; i++) {
    var itemText = items[i].textContent.toLowerCase();
    if (itemText.indexOf(input) > -1) {
    items[i].style.display = "";
    } else {
    items[i].style.display = "none";
    }
}
}

// Function to select an amulet item
function selectAmuletItem(itemText, imageUrl) {
    selectedAmuletText.textContent = itemText;
    toggleAmuletDropdown();
    updateAmuletImage(imageUrl);
}

function updateHelmetImage(imageUrl) {
    var helmetImage = document.getElementById("helmet-image");
    var helmetLink = document.getElementById("helmet-link");
    var equipmentHead = document.getElementById("equipment-head");
    var equipmentPlinkp = document.getElementById("equipment-plinkp");

    helmetImage.src = imageUrl;
    helmetLink.href = "https://oldschool.runescape.wiki/w/" + selectedHelmetText.textContent.replace(/\s+/g, "_");

    if (selectedHelmetText.textContent === "Helmet") {
        equipmentHead.classList.remove("equipment-blank");
        equipmentPlinkp.style.display = "none";
    } else {
        equipmentHead.classList.add("equipment-blank");
        equipmentPlinkp.style.display = "flex";
    }
}

function updateAmuletImage(imageUrl) {
    var amuletImage = document.getElementById("amulet-image");
    var amuletLink = document.getElementById("amulet-link");
    var equipmentAmulet = document.getElementById("equipment-amulet");
    var equipmentPlinkp = document.getElementById("equipment-plinkp");

    amuletImage.src = imageUrl;
    amuletLink.href = "https://oldschool.runescape.wiki/w/" + selectedAmuletText.textContent.replace(/\s+/g, "_");

    if (selectedAmuletText.textContent === "Amulet") {
        equipmentAmulet.classList.remove("equipment-blank");
    } else {
        equipmentAmulet.classList.add("equipment-blank");
    }

    if (selectedHelmetText.textContent === "Helmet" && selectedAmuletText.textContent === "Amulet") {
        equipmentPlinkp.style.display = "none";
    } else {
        equipmentPlinkp.style.display = "flex";
    }
}

// Fetch helmet items
fetch('/api/helmets')
.then(response => response.json())
.then(items => {
    console.log('Helmet items retrieved:', items);

    const itemList = document.getElementById('helmet-item-list');
    itemList.innerHTML = ''; // Clear the existing helmet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectHelmetItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Helmet dropdown menu populated:', items);
})
.catch(error => {
    console.error('Error retrieving helmet items:', error);
});

// Fetch amulet items
fetch('/api/amulets')
.then(response => response.json())
.then(items => {
    console.log('Amulet items retrieved:', items);

    const itemList = document.getElementById('amulet-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectAmuletItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Amulet dropdown menu populated:', items);
})
.catch(error => {
    console.error('Error retrieving amulet items:', error);
});
