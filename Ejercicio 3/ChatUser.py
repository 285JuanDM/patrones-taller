from UserI import UserI

class ChatUser(UserI):
    def send(self, message):
        print(f"{self.name} envía: {message}")
        self.mediator.show_message(self, message)
