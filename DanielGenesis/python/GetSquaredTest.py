import unittest
from GetSquared import*

class TestPerfectSquare(unittest.TestCase):
	def test_to_raise_value_error_if_not_list(self):
		my_list = [2, 3, 4, 5, 9, 15, 22]
		self.assertRaises(ValueError, get_perfect_square, 4)
	
	def test_to_to_raise_value_error_if_not_list_of_integers(self):
		list = ['egg', 'yam']
		self.assertRaises(ValueError, get_perfect_square, list)
	
	def test_to_to_raise_value_error_if_not_list_of_possitive_integers(self):
		list = [-1, 2]
		self.assertRaises(ValueError, get_perfect_square, list)
	
	def test_to_append_true_to_new_list_if_perfect_square(self):
		list = ['true']
		self.assertEqual(get_perfect_square([4]), list)
	
	def test_to_append_false_to_new_list_if_not_perfect_square(self):
		list = ['false']
		self.assertEqual(get_perfect_square([2]), list)
	
		

		
		
