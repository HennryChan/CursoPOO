from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, drive, typeCarAccepted, seatsMaterial):
        super().__init__(license, drive)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial
        