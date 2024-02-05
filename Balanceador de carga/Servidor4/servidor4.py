from flask import Flask

servidor4 = Flask(__name__)

@servidor4.route('/')
def hola():
    return "Hola desdee el servidor 4"

if __name__ == "__main__":
    servidor4.run(host="0.0.0.0")