from Automovil import Automovil

class AutomovilBuilder:
    def __init__(self):
        self._motor = None
        self._color = None
        self._llantas = None
        self._sonido = None
        self._interiores = None
        self._techo_solar = False
        self._gps = False

    def set_motor(self, motor):
        self._motor = motor
        return self

    def set_color(self, color):
        self._color = color
        return self

    def set_llantas(self, llantas):
        self._llantas = llantas
        return self

    def set_sonido(self, sonido):
        self._sonido = sonido
        return self

    def set_interiores(self, interiores):
        self._interiores = interiores
        return self

    def set_techo_solar(self, techo_solar=True):
        self._techo_solar = techo_solar
        return self

    def set_gps(self, gps=True):
        self._gps = gps
        return self

    def build(self):
        return Automovil(
            motor=self._motor,
            color=self._color,
            llantas=self._llantas,
            sonido=self._sonido,
            interiores=self._interiores,
            techo_solar=self._techo_solar,
            gps=self._gps
        )