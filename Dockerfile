FROM openjdk:8
USER root
EXPOSE 8443
WORKDIR "/app"
ENTRYPOINT []
CMD ["java", "-jar", "/app/daylife.jar"] 