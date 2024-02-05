#utiliza una imagen de python

FROM python:3.9

#establece el directorio de trbajp dentro del contenedor
WORKDIR     /servidor

#copiar todos los archivos desde el host al direcctorio

COPY . .

#INSTALAR DEPENCIAS REQUERIDAS
RUN pip install flask

#exponer puerto del contenedor
EXPOSE 5000

#comand para ejecutar aplicaciones
CMD ["python","app.py"]
