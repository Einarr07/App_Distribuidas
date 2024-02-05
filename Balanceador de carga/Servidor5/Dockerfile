FROM python:latest

# Establece el directorio de trabajo en la carpeta
WORKDIR /servidor5

# Copia el archivo de la aplicación y los requisitos
COPY servidor5.py .

# Instala las dependencias necesarias
RUN pip install flask

# Define el comando por defecto para ejecutar 
CMD ["python", "servidor5.py"]