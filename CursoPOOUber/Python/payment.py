import email


class Payment:
    id = int
    monto = float
    fecha = str 
    email = str

    def __init__(self, monto, fecha, email):
        self.monto = monto
        self.fecha = fecha
        self.email = email