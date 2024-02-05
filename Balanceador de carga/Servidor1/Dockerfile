FROM python:latest

# Establece el directorio de trabajo en la carpeta
WORKDIR /servidor1

# Copia el archivo de la aplicación y los requisitos
COPY servidor1.py .

# Instala las dependencias necesarias
RUN pip install flask

# Define el comando por defecto para ejecutar 
CMD ["python", "servidor1.py"]