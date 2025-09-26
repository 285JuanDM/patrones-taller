
from ChatRoom import ChatRoom
from UserChat import UserChat


if __name__ == "__main__":
    chatRoom = ChatRoom()

    user1 = UserChat(chatRoom, "Sofía")
    user2 = UserChat(chatRoom, "Andres")
    user3 = UserChat(chatRoom, "Ammi")

    chatRoom.addUser(user1)
    chatRoom.addUser(user2)
    chatRoom.addUser(user3)

    user1.send("Hola a todos, ¿cómo están?")
    user3.send("Hola Sofía, ¿cómo estás?")
