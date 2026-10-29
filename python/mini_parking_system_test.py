import unittest
from mini_parking_system import MiniParkingSystem

class MiniParkingSystemTest(unittest.TestCase):

    def setUp(self):
        
        self.lot = MiniParkingSystem(20)

    def test_01_slot_is_empty_at_start(self):
        self.assertEqual(self.lot.available_spaces(), 20)

    def test_02_first_car_goes_to_slot_1(self):
        slot = self.lot.enter()
        self.assertEqual(slot, 1)

    def test_03_cars_fill_left_to_right(self):
        self.lot.enter() 
        self.lot.enter()
        slot = self.lot.enter()
        self.assertEqual(slot, 3)

    def test_04_can_park_at_given_slot(self):
        result = self.lot.enter_at(10)
        self.assertEqual(result, 10)

    def test_05_cannot_park_where_car_already_exists(self):
        self.lot.enter_at(5)
        result = self.lot.enter_at(5)
        self.assertEqual(result, None)



#python3 -m unittest -v "name of your text file"    
