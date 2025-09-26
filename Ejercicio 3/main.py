from ChatMediatorImpl import ChatMediatorImpl
from ChatUser import ChatUser

if __name__ == "__main__":
    mediator = ChatMediatorImpl()

    user1 = ChatUser("Alicia", mediator)
    user2 = ChatUser("Bob", mediator)
    user3 = ChatUser("Charlie", mediator)

    mediator.add_user(user1)
    mediator.add_user(user2)
    mediator.add_user(user3)

    user1.send("Hola a todos!")
    user2.send("Hola Alicia!")
    user3.send("Hola Alicia y Bob!")