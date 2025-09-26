from MediatorI import MediatorI

class ChatMediatorImpl(MediatorI):
    def __init__(self):
        self.users = []

    def add_user(self, user):
        self.users.append(user)

    def show_message(self, user, message):
        print(f"[{user.name}] dice: {message}")

        
    