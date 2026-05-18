#version 410
#extension GL_ARM_shader_framebuffer_fetch : enable

in vec2 vTexCoord;
in vec3 vNormal;
in vec3 vPosition;

uniform sampler2D uTexture;
uniform sampler2D uDepthTexture;

out vec4 fragColor;

const vec2 tileSize = vec2(32.0);

vec2 getTileCoord() {
    vec2 pixelCoord = gl_FragCoord.xy;
    return floor(pixelCoord / tileSize);
}

void main() {
    if (gl_FragCoord.z > 0.999) {
        discard;
    }
    vec2 tileCoord = getTileCoord();
    vec4 texColor = texture(uTexture, vTexCoord);
    fragColor = texColor;
}
