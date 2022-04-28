from payment import Payment

class Tarjeta:
    id = int
    numTarjeta = str
    cvv = int
    monto = float
    fecha = str
    email = str

    def __init__(self, numTrajeta, cvv, monto, fecha, email):
        super().__init__(monto, fecha, email)
        self.numTrajeta = numTrajeta
        self.cvv = cvv
        self.monto = monto
        self.fecha = fecha
        self.email = email
        


