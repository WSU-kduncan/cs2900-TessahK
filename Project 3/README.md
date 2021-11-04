# Project 3 Documentation
## Investigating available mounts
Docker: Docker has volumes, bind mounts, and tmpfs mounts. Volumes are the preferred way to store persistant data and are completely managed by Docker. To create a volume --mount type=volume can be used. Bind mounts mount a file or directory on the host machine to the container. They can be created by using --mount type=bind. Tmpfs mounts can only be used on linux and are used to store temporary data and the mount is removed when the container is stopped. To create one --mount type=tmpfs can be used.  

Podman: Podman has volumes, bind mounts, and tmpfs mounts just like Docker. Volumes have the same use as in Docker and are used for persistant data. Bind mounts also serve the same purpose and mount a file from the host to the container. Tmpfs mounts also have the same purpose of storing temporary data and are deleted when the container stops. They can be created just the same as in Docker, using --mount type=bind/volume/tmpfs.  

## Investigating building images  
Docker: The command docker build can be used to build an image from a Dockerfile. All Dockerfiles must start with FROM to specify the image the container will be built from. Other instructions can be included in this file such as RUN and COPY.  

Podman: The command podman build can be used to build an image from a Containerfile or Dockerfile. Containerfiles use the same syntax as Dockerfiles hence why they can be named either. This means the file should also start with FROM to specify the parent image and can then contain other commands like COPY, RUN, and ENV.