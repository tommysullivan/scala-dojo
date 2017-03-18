#!/usr/bin/env bash

echo "Setting up Dev Environment for first time use on a Mac..."
echo "- Assumes homebrew is installed and working."
echo "- Assumes adequate permissions. (see script source for help with this)"

# Uncomment below ensure brew can write to necessary locations:

# chown -R $USER /usr/local
# sudo chown -R $USER /Library/Caches/Homebrew

brew install sbt