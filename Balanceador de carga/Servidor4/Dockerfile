FROM python:latest

# Establece el directorio de trabajo en la carpeta
WORKDIR /servidor4

# Copia el archivo de la aplicación y los requisitos
COPY servidor4.py .

# Instala las dependencias necesarias
RUN pip install flask

# Define el comando por defecto para ejecutar 
CMD ["python", "servidor4.py"]