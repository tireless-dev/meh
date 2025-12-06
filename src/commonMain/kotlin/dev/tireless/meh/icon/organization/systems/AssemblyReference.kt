package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AssemblyReference: ImageVector
    get() {
        val current = _assemblyReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AssemblyReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="4" height="2" x="8.7" y="5.1" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.438315 6.144885
                moveTo(x = 8.438315f, y = 6.144885f)
                // l 3.443572 -2.035144
                lineToRelative(dx = 3.443572f, dy = -2.035144f)
                // l 1.017572 1.721786
                lineToRelative(dx = 1.017572f, dy = 1.721786f)
                // l -3.443572 2.035144z
                lineToRelative(dx = -3.443572f, dy = 2.035144f)
                close()
            }
            // M6 12 H4 V9.9 c0 -.7 .4 -1.4 1 -1.7 l1.5 -.9 1 1.7 L6 9.9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 9.9
                verticalLineTo(y = 9.9f)
                // c 0 -0.7 0.4 -1.4 1 -1.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                    dx2 = 0.4f,
                    dy2 = -1.4f,
                    dx3 = 1.0f,
                    dy3 = -1.7f,
                )
                // l 1.5 -0.9
                lineToRelative(dx = 1.5f, dy = -0.9f)
                // l 1 1.7
                lineToRelative(dx = 1.0f, dy = 1.7f)
                // L 6 9.9z
                lineTo(x = 6.0f, y = 9.9f)
                close()
            }
            // <rect width="2" height="4" x="4.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M6.5 24.7 5 23.8 c-.6 -.4 -1 -1 -1 -1.7 V20 h2 v2.1 L7.5 23z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6.5 24.7
                moveTo(x = 6.5f, y = 24.7f)
                // L 5 23.8
                lineTo(x = 5.0f, y = 23.8f)
                // c -0.6 -0.4 -1 -1 -1 -1.7
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = -0.4f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                    dx3 = -1.0f,
                    dy3 = -1.7f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // L 7.5 23z
                lineTo(x = 7.5f, y = 23.0f)
                close()
            }
            // <rect width="2" height="4" x="9.5" y="24.1" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.432638 25.82751
                moveTo(x = 8.432638f, y = 25.82751f)
                // l 1.0174516 -1.7218572
                lineToRelative(dx = 1.0174516f, dy = -1.7218572f)
                // l 3.4437144 2.0349033
                lineToRelative(dx = 3.4437144f, dy = 2.0349033f)
                // l -1.0174516 1.7218572z
                lineToRelative(dx = -1.0174516f, dy = 1.7218572f)
                close()
            }
            // M17.5 27.1 16 28 l-1.5 -.9 -1 1.7 1.5 .9 c.3 .2 .7 .3 1 .3 .4 0 .7 -.1 1 -.3 l1.5 -.9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.5 27.1
                moveTo(x = 17.5f, y = 27.1f)
                // L 16 28
                lineTo(x = 16.0f, y = 28.0f)
                // l -1.5 -0.9
                lineToRelative(dx = -1.5f, dy = -0.9f)
                // l -1 1.7
                lineToRelative(dx = -1.0f, dy = 1.7f)
                // l 1.5 0.9
                lineToRelative(dx = 1.5f, dy = 0.9f)
                // c 0.3 0.2 0.7 0.3 1 0.3
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.2f,
                    dx2 = 0.7f,
                    dy2 = 0.3f,
                    dx3 = 1.0f,
                    dy3 = 0.3f,
                )
                // c 0.4 0 0.7 -0.1 1 -0.3
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.0f,
                    dx2 = 0.7f,
                    dy2 = -0.1f,
                    dx3 = 1.0f,
                    dy3 = -0.3f,
                )
                // l 1.5 -0.9z
                lineToRelative(dx = 1.5f, dy = -0.9f)
                close()
            }
            // <rect width="4" height="2" x="19.8" y="24.9" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.521868 25.90673
                moveTo(x = 19.521868f, y = 25.90673f)
                // l 3.443572 -2.035144
                lineToRelative(dx = 3.443572f, dy = -2.035144f)
                // l 1.017572 1.721786
                lineToRelative(dx = 1.017572f, dy = 1.721786f)
                // l -3.443572 2.035144z
                lineToRelative(dx = -3.443572f, dy = 2.035144f)
                close()
            }
            // m25.2 24.9 -1 -1.7 1.8 -1 V20 h2 v2.1 c0 .7 -.4 1.4 -1 1.7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.2 24.9
                moveTo(x = 25.2f, y = 24.9f)
                // l -1 -1.7
                lineToRelative(dx = -1.0f, dy = -1.7f)
                // l 1.8 -1
                lineToRelative(dx = 1.8f, dy = -1.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // c 0 0.7 -0.4 1.4 -1 1.7z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.7f,
                    dx2 = -0.4f,
                    dy2 = 1.4f,
                    dx3 = -1.0f,
                    dy3 = 1.7f,
                )
                close()
            }
            // <rect width="2" height="4" x="26.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 14
                moveTo(x = 26.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M28 12 h-2 V9.9 l-1.8 -1 1 -1.7 1.8 1 c.6 .4 1 1 1 1.7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 9.9
                verticalLineTo(y = 9.9f)
                // l -1.8 -1
                lineToRelative(dx = -1.8f, dy = -1.0f)
                // l 1 -1.7
                lineToRelative(dx = 1.0f, dy = -1.7f)
                // l 1.8 1
                lineToRelative(dx = 1.8f, dy = 1.0f)
                // c 0.6 0.4 1 1 1 1.7z
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.4f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.7f,
                )
                close()
            }
            // <rect width="2" height="4" x="20.5" y="4.3" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.451073 6.039818
                moveTo(x = 19.451073f, y = 6.039818f)
                // l 1.0174516 -1.7218572
                lineToRelative(dx = 1.0174516f, dy = -1.7218572f)
                // l 3.4437144 2.0349033
                lineToRelative(dx = 3.4437144f, dy = 2.0349033f)
                // l -1.0174516 1.7218572z
                lineToRelative(dx = -1.0174516f, dy = 1.7218572f)
                close()
            }
            // M17.5 4.9 16 4 l-1.5 .9 -1 -1.7 L15 2.3 C15.3 2.1 15.6 2 16 2 s.7 .1 1 .3 l1.5 .9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.5 4.9
                moveTo(x = 17.5f, y = 4.9f)
                // L 16 4
                lineTo(x = 16.0f, y = 4.0f)
                // l -1.5 0.9
                lineToRelative(dx = -1.5f, dy = 0.9f)
                // l -1 -1.7
                lineToRelative(dx = -1.0f, dy = -1.7f)
                // L 15 2.3
                lineTo(x = 15.0f, y = 2.3f)
                // C 15.3 2.1 15.6 2 16 2
                curveTo(
                    x1 = 15.3f,
                    y1 = 2.1f,
                    x2 = 15.6f,
                    y2 = 2.0f,
                    x3 = 16.0f,
                    y3 = 2.0f,
                )
                // s 0.7 0.1 1 0.3
                reflectiveCurveToRelative(
                    dx1 = 0.7f,
                    dy1 = 0.1f,
                    dx2 = 1.0f,
                    dy2 = 0.3f,
                )
                // l 1.5 0.9z
                lineToRelative(dx = 1.5f, dy = 0.9f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _assemblyReference = it }
    }

@Suppress("ObjectPropertyName")
private var _assemblyReference: ImageVector? = null
