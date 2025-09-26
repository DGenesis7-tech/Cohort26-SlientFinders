import math

def get_perfect_square(numbers):
	new_list = []
	if not isinstance(numbers, list):
		raise ValueError('Input must be a list')
	for number in numbers:
		if not isinstance(number, int):
			raise ValueError('Input must be a list of possitive integers')
		
		if math.sqrt(number) == int(math.sqrt(number)):
			new_list.append('true')
		else:
			new_list.append('false')
		
	return new_list
	
print(get_perfect_square([2, 3, 4, 5, 9, 15, 22]))			 