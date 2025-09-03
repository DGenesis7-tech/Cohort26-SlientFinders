function outlier(myArray) {
let evenArray = [];
let oddArray = [];

	for (let index = 0; index < myArray.length; index++) {
		if (myArray[index] % 2 == 0) {
		evenArray.push(myArray[index]); 
		} 
		else {
		oddArray.push(myArray[index]);
		}	
	}
	if (evenArray.length <= 1) return `${evenArray[0]} (the only even number)`;
	if (oddArray.length <= 1) return `${oddArray[0]} (the only odd number)`;
}


let myArray = [160, 3, 1719, 19, 11, 13, -21];
console.log(outlier(myArray));