

from abc import ABC, abstractmethod

class MediatorChat(ABC):
    @abstractmethod
    def sendMessage(self, message, sender):
        pass

    @abstractmethod
    def addUser(self, user):
        pass
