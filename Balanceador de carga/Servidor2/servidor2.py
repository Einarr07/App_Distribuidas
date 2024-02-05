from flask import Flask

servidor2 = Flask(__name__)

@servidor2.route('/')
def hola():
    return "Hola desdee el servidor 2"

if __name__ == "__main__":
    servidor2.run(host="0.0.0.0")