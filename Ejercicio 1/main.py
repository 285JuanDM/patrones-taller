from AutomovilBuilder import AutomovilBuilder

# Cliente crea un auto personalizado con el patron builder
if __name__ == "__main__":
    builder = AutomovilBuilder()

    motor = input("👉 Elige motor (1.6L, V6, V8): ")
    builder.set_motor(motor)

    color = input("👉 Elige color: ")
    builder.set_color(color)

    if input("👉 ¿Quieres llantas personalizadas? (s/n): ").lower() == "s":
        llantas = input("   Ingresa tipo de llantas: ")
        builder.set_llantas(llantas)

    if input("👉 ¿Quieres sistema de sonido premium? (s/n): ").lower() == "s":
        sonido = input("   Ingresa marca de sonido: ")
        builder.set_sonido(sonido)

    if input("👉 ¿Quieres interiores personalizados? (s/n): ").lower() == "s":
        interiores = input("   Ingresa tipo de interiores: ")
        builder.set_interiores(interiores)

    if input("👉 ¿Quieres techo solar? (s/n): ").lower() == "s":
        builder.set_techo_solar(True)

    if input("👉 ¿Quieres GPS? (s/n): ").lower() == "s":
        builder.set_gps(True)

    # Construir el carro luego de la personalización del usuario
    automovil = builder.build()
    print(automovil)
