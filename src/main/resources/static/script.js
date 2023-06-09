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

// Function to set the selected item
function selectItem(itemText, imageUrl) {
    selectedItemText.textContent = itemText;
    toggleDropdown();
    updateHelmetImage(imageUrl);
}

// Function to update the helmet image
function updateHelmetImage(imageUrl) {
    var helmetImage = document.getElementById("helmet-image");
    helmetImage.src = imageUrl;
}

