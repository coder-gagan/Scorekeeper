#!/bin/bash

cd "$(dirname "$0")"

echo "Stopping services and removing volumes..."
docker-compose down -v

echo "Services and volumes removed."
