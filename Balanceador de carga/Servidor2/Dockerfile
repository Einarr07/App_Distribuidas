FROM python:latest

# Establece el directorio de trabajo en la carpeta
WORKDIR /servidor2

# Copia el archivo de la aplicación y los requisitos
COPY servidor2.py .

# Instala las dependencias necesarias
RUN pip install flask

# Define el comando por defecto para ejecutar 
CMD ["python", "servidor2.py"]