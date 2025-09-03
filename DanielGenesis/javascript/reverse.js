function reverse(array) {
	for (let index = 0; index < array.length; index++) {
		if (array[index] >= 0) {
			array[index] = 0 - array[index];
		}
		else {
			array[index] = -1 * array[index];
		}
	}
return array;
}


let myArray =  [1, 2, 3, 4, 5];

console.log(reverse(myArray));