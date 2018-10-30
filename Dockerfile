FROM airhacks/glassfish
COPY ./target/tickets.war ${DEPLOYMENT_DIR}
