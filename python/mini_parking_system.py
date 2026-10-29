class MiniParkingSystem:
    def __init__(self, size=20):
        self.size = size
        self.slots = [0] * size  

    def enter(self):
       
        for count in range(self.size):
            if self.slots[count] == 0:
                self.slots[count] = 1
                return count + 1
        return None 

    def enter_at(self, slot_number):

        index = slot_number - 1
        if self.slots[index] == 1:
            return None
        self.slots[index] = 1
        return slot_number


    def available_spaces(self):
        return self.slots.count(0)

    def filled_spaces(self):
        return self.slots.count(1)

   
