# Ejercicio 1
def greaterThan(a:Float,b:Float)  = if (a > b) a else b

print(greaterThan(4,3))

#Ejercicio 2

def radianesAGrados(radianes:Double) = radianes * (180 /Math.PI)

#Ejercicio3:
def kelvinACelsius(kelvin : Double) : Double = kelvin - 273.15;
print(radianesAGrados(90))

#Ejercicio4
def eliminarVocalesAbiertas(texto:String) =  texto.toLowerCase().replaceAll("a", "").replaceAll("e", "").replaceAll("o", "")

print(eliminarVocalesAbiertas("SI pero no"))


#Ejercicio 5
def calcularEnergiaCinetica(masa : Double, velocidad : Double) : Double = 0.5 * masa * (velocidad*velocidad)


# Parte 2


def sumaCubos(i : Int) : Int = (1 to i).map(i => i*i*i).sum

def f2(limite: Int): Any = (1 to limite).map(elementito => Math.pow(-1*elementito,elementito)).product
print(f2(3))


def sumaImpares(i : Int) : Int = (1 to i).map(i => 1 / ((2*i) - 1)).sum


def sumaSecuencia(i : Int, constante : Int) : Int = (1 to i).map(
  i => (i+1) * constante
).sum

def f4(limite: Int): Any = (1 to limite).map(elementito => 2*elementito).product
print(f4(4))





# PARTE DOS del repo de Jorge
#Ignorar
#F1
def f1(n: Int) = (1 to n).sum

#F2
def f2(limite: Int): Any = (1 to limite).map(elementito => -1*elementito).product
print(f2(3))

#F4


