from abc import ABC, abstractmethod

class UserI(ABC):
    def __init__(self, name, mediator):
        self.name = name
        self.mediator = mediator
    
    @abstractmethod
    def send(self, message):
        pass