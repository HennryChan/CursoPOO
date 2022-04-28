from payment import Payment
class Efectivo:
    id = int
    cambio = float
    monto = float
    fecha = str
    email = str

    def __init__(self, cambio, monto, fecha, email):
        super().__init__(monto, fecha, email)
        self.cambio = cambio
        self.monto = monto
        self.fecha = fecha
        self.email = email

