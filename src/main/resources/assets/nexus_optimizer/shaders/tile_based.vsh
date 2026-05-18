#version 410

in vec3 aPos;
in vec2 aTexCoord;
in vec3 aNormal;

out vec2 vTexCoord;
out vec3 vNormal;
out vec3 vPosition;

uniform mat4 uModel;
uniform mat4 uView;
uniform mat4 uProjection;

void main() {
    gl_Position = uProjection * uView * uModel * vec4(aPos, 1.0);
    vTexCoord = aTexCoord;
    vNormal = aNormal;
    vPosition = aPos;
}
