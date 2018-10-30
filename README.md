# Build
mvn clean package && docker build -t gt.com.kinal/tickets .

# RUN

docker rm -f tickets || true && docker run -d -p 8080:8080 -p 4848:4848 --name tickets gt.com.kinal/tickets 