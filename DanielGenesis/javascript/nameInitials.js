function nameInitials(name) {
let initials = "";
	for (let char = 0; char < name.length; char++) {
		if (char == 0) {
		initials += name[char].toUpperCase();
		}
		if (name[char] === ' ') {
		initials += '.' + name[char + 1].toUpperCase();
		break;
		}
	}
return initials;  	
}

console.log(nameInitials("sam harris david"));	