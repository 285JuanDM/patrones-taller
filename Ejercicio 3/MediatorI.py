from abc import ABC, abstractmethod

class MediatorI(ABC):
    @abstractmethod
    def show_message(self, user, message):
        pass

