# Utiliza una imagen de Python como base
FROM python:3.9

# Establece el directorio de trabajo en la carpeta de la aplicación
WORKDIR /servidor2

# Copia el archivo de la aplicación y los requisitos al directorio de trabajo
COPY . .

# Instala las dependencias necesarias
RUN pip install flask

# Define el comando por defecto para ejecutar la aplicación
CMD [ "python", "app2.py" ]

EXPOSE 5003