FROM ollama/ollama:latest
RUN apt update && apt install -y curl
RUN /bin/sh -c "/bin/ollama serve & until curl -sf http://localhost:11434; do sleep 1; done && ollama pull llama3"
ENTRYPOINT ["/bin/ollama"]
CMD ["serve"]
