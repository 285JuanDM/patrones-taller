class Automovil:
    def __init__(self, motor, color, llantas, sonido, interiores, techo_solar, gps):
        self._motor = motor
        self._color = color
        self._llantas = llantas
        self._sonido = sonido
        self._interiores = interiores
        self._techo_solar = techo_solar
        self._gps = gps

    def __str__(self):
        return (f"\n🚗 Automóvil creado:\n"
                f"- Motor: {self._motor}\n"
                f"- Color: {self._color}\n"
                f"- Llantas: {self._llantas}\n"
                f"- Sonido: {self._sonido}\n"
                f"- Interiores: {self._interiores}\n"
                f"- Techo solar: {'Sí' if self._techo_solar else 'No'}\n"
                f"- GPS: {'Sí' if self._gps else 'No'}\n")