from payment import Payment

class Paypal:

    id = int
    monto = float
    fecha = str
    email = str

    def __init__(self, monto, fecha, email):
        super().__init__(monto, fecha, email)
        self.monto = monto
        self.fecha = fecha
        self.email = email