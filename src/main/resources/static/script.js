// Get the elements for the helmet dropdown
var helmetDropdownContent = document.getElementById("helmet-dropdown-content");
var helmetSearchInput = document.getElementById("helmet-search-input");
var selectedHelmetText = document.getElementById("selected-helmet-text");

// Get the elements for the amulet dropdown
var amuletDropdownContent = document.getElementById("amulet-dropdown-content");
var amuletSearchInput = document.getElementById("amulet-search-input");
var selectedAmuletText = document.getElementById("selected-amulet-text");

// Get the elements for the cape dropdown
var capeDropdownContent = document.getElementById("cape-dropdown-content");
var capeSearchInput = document.getElementById("cape-search-input");
var selectedCapeText = document.getElementById("selected-cape-text");

// Get the elements for the weapon dropdown
var weaponDropdownContent = document.getElementById("weapon-dropdown-content");
var weaponSearchInput = document.getElementById("weapon-search-input");
var selectedWeaponText = document.getElementById("selected-weapon-text");

// Get the elements for the torso dropdown
var torsoDropdownContent = document.getElementById("torso-dropdown-content");
var torsoSearchInput = document.getElementById("torso-search-input");
var selectedTorsoText = document.getElementById("selected-torso-text");

// Get the elements for the shield dropdown
var shieldDropdownContent = document.getElementById("shield-dropdown-content");
var shieldSearchInput = document.getElementById("shield-search-input");
var selectedShieldText = document.getElementById("selected-shield-text");

// Get the elements for the legs dropdown
var legsDropdownContent = document.getElementById("legs-dropdown-content");
var legsSearchInput = document.getElementById("legs-search-input");
var selectedLegsText = document.getElementById("selected-legs-text");

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

// Function to toggle the cape dropdown
function toggleCapeDropdown() {
    capeDropdownContent.classList.toggle("show");
}

// Function to filter the cape items based on search input
function filterCapeItems() {
    var input = capeSearchInput.value.toLowerCase();
    var items = capeDropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

// Function to select a cape item
function selectCapeItem(itemText, imageUrl) {
    selectedCapeText.textContent = itemText;
    toggleCapeDropdown();
    updateCapeImage(imageUrl);
}

// Function to toggle the weapon dropdown
function toggleWeaponDropdown() {
    weaponDropdownContent.classList.toggle("show");
}

// Function to filter the weapon items based on search input
function filterWeaponItems() {
    var input = weaponSearchInput.value.toLowerCase();
    var items = weaponDropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

// Function to select a weapon item
function selectWeaponItem(itemText, imageUrl) {
    selectedWeaponText.textContent = itemText;
    toggleWeaponDropdown();
    updateWeaponImage(imageUrl);
}

// Function to toggle the torso dropdown
function toggleTorsoDropdown() {
    torsoDropdownContent.classList.toggle("show");
}

// Function to filter the torso items based on search input
function filterTorsoItems() {
    var input = torsoSearchInput.value.toLowerCase();
    var items = torsoDropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

// Function to select a torso item
function selectTorsoItem(itemText, imageUrl) {
    selectedTorsoText.textContent = itemText;
    toggleTorsoDropdown();
    updateTorsoImage(imageUrl);
}

// Function to toggle the shield dropdown
function toggleShieldDropdown() {
    shieldDropdownContent.classList.toggle("show");
}

// Function to filter the shield items based on search input
function filterShieldItems() {
    var input = shieldSearchInput.value.toLowerCase();
    var items = shieldDropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

// Function to select a shield item
function selectShieldItem(itemText, imageUrl) {
    selectedShieldText.textContent = itemText;
    toggleShieldDropdown();
    updateShieldImage(imageUrl);
}

// Function to toggle the legs dropdown
function toggleLegsDropdown() {
    legsDropdownContent.classList.toggle("show");
}

// Function to filter the legs items based on search input
function filterLegsItems() {
    var input = legsSearchInput.value.toLowerCase();
    var items = legsDropdownContent.getElementsByTagName("a");

    for (var i = 0; i < items.length; i++) {
        var itemText = items[i].textContent.toLowerCase();
        if (itemText.indexOf(input) > -1) {
            items[i].style.display = "";
        } else {
            items[i].style.display = "none";
        }
    }
}

// Function to select a legs item
function selectLegsItem(itemText, imageUrl) {
    selectedLegsText.textContent = itemText;
    toggleLegsDropdown();
    updateLegsImage(imageUrl);
}

function updateEquipmentItem(itemName, imageUrl, itemLink, equipmentElement) {
    var itemImage = document.getElementById(itemName + "-image");
    var itemLinkElement = document.getElementById(itemName + "-link");

    itemImage.src = imageUrl;
    itemLinkElement.href = itemLink;

    if (
        itemName === "helmet" && selectedHelmetText.textContent === "Helmet" ||
        itemName === "amulet" && selectedAmuletText.textContent === "Amulet" ||
        itemName === "cape" && selectedCapeText.textContent === "Cape" ||
        itemName === "weapon" && selectedWeaponText.textContent === "Weapon" ||
        itemName === "torso" && selectedTorsoText.textContent === "Torso" ||
        itemName === "shield" && selectedShieldText.textContent === "Shield" ||
        itemName === "legs" && selectedLegsText.textContent === "Legs"
    ) {
        equipmentElement.classList.remove("equipment-blank");
    } else {
        equipmentElement.classList.add("equipment-blank");
    }
}

function updateHelmetImage(imageUrl) {
    var equipmentHead = document.getElementById("equipment-head");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedHelmetText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("helmet", imageUrl, itemLink, equipmentHead);
}

function updateAmuletImage(imageUrl) {
    var equipmentAmulet = document.getElementById("equipment-amulet");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedAmuletText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("amulet", imageUrl, itemLink, equipmentAmulet);
}

function updateCapeImage(imageUrl) {
    var equipmentCape = document.getElementById("equipment-cape");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedCapeText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("cape", imageUrl, itemLink, equipmentCape);
}

function updateWeaponImage(imageUrl) {
    var equipmentWeapon = document.getElementById("equipment-weapon");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedWeaponText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("weapon", imageUrl, itemLink, equipmentWeapon);
}

function updateTorsoImage(imageUrl) {
    var equipmentTorso = document.getElementById("equipment-torso");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedTorsoText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("torso", imageUrl, itemLink, equipmentTorso);
}

function updateShieldImage(imageUrl) {
    var equipmentShield = document.getElementById("equipment-shield");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedShieldText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("shield", imageUrl, itemLink, equipmentShield);
}

function updateLegsImage(imageUrl) {
    var equipmentLegs = document.getElementById("equipment-legs");
    var itemLink = "https://oldschool.runescape.wiki/w/" + selectedLegsText.textContent.replace(/\s+/g, "_");

    updateEquipmentItem("legs", imageUrl, itemLink, equipmentLegs);
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

// Fetch amulet items
fetch('/api/capes')
.then(response => response.json())
.then(items => {
    console.log('Cape items retrieved:', items);

    const itemList = document.getElementById('cape-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectCapeItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Cape dropdown menu populated:', items);
})
.catch(error => {
    console.error('Error retrieving cape items:', error);
});

// Fetch amulet items
fetch('/api/weapons')
.then(response => response.json())
.then(items => {
    console.log('Weapon items retrieved:', items);

    const itemList = document.getElementById('weapon-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectWeaponItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Weapon dropdown menu populated:', items);
})
.catch(error => {
    console.error('Error retrieving weapon items:', error);
});

// Fetch amulet items
fetch('/api/torsos')
.then(response => response.json())
.then(items => {
    console.log('Torso items retrieved:', items);

    const itemList = document.getElementById('torso-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectTorsoItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Torso dropdown menu populated:', items);
})
.catch(error => {
    console.error('Error retrieving torso items:', error);
});

// Fetch amulet items
fetch('/api/shields')
.then(response => response.json())
.then(items => {
    console.log('Shield items retrieved:', items);

    const itemList = document.getElementById('shield-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectShieldItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Shield dropdown menu populated:', items);
}
)
.catch(error => {
    console.error('Error retrieving shield items:', error);
}
);

// Fetch amulet items
fetch('/api/legs')
.then(response => response.json())
.then(items => {
    console.log('Leg items retrieved:', items);

    const itemList = document.getElementById('legs-item-list');
    itemList.innerHTML = ''; // Clear the existing amulet dropdown items

    items.forEach(item => {
    const link = document.createElement('a');
    link.href = '#';
    link.textContent = item.name;
    link.onclick = () => selectLegsItem(item.name, item.imageUrl);

    const itemDiv = document.createElement('div');
    itemDiv.appendChild(link);
    itemList.appendChild(itemDiv);
    });

    console.log('Legs dropdown menu populated:', items);
}  
)
.catch(error => {
    console.error('Error retrieving legs items:', error);
}
);
