class UserChat(User):
    def __init__(self, mediator, name):
        super().__init__(mediator, name)

    def send(self, message):
        print(f"{self.name} envía: {message}")
        self.mediator.sendMessage(message, self)

    def receive(self, message, sender):
        print(f"{self.name} recibió de {sender.name}: {message}")
