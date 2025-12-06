package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mysql: ImageVector
    get() {
        val current = _mysql
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Mysql",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28.25 11.92 h3.17 l-4.64 13.94 a4.3 4.3 0 0 1 -1.3 2.07 3.8 3.8 0 0 1 -2.4 .67 h-2.12 v-2.64 h2.27 l.42 -1.34 -4.23 -12.7 h3.38 l1.77 5.64 .87 3.5 h.14 l.9 -3.5z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.25 11.92
                moveTo(x = 28.25f, y = 11.92f)
                // h 3.17
                horizontalLineToRelative(dx = 3.17f)
                // l -4.64 13.94
                lineToRelative(dx = -4.64f, dy = 13.94f)
                // a 4.3 4.3 0 0 1 -1.3 2.07
                arcToRelative(
                    a = 4.3f,
                    b = 4.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = 2.07f,
                )
                // a 3.8 3.8 0 0 1 -2.4 0.67
                arcToRelative(
                    a = 3.8f,
                    b = 3.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.4f,
                    dy1 = 0.67f,
                )
                // h -2.12
                horizontalLineToRelative(dx = -2.12f)
                // v -2.64
                verticalLineToRelative(dy = -2.64f)
                // h 2.27
                horizontalLineToRelative(dx = 2.27f)
                // l 0.42 -1.34
                lineToRelative(dx = 0.42f, dy = -1.34f)
                // l -4.23 -12.7
                lineToRelative(dx = -4.23f, dy = -12.7f)
                // h 3.38
                horizontalLineToRelative(dx = 3.38f)
                // l 1.77 5.64
                lineToRelative(dx = 1.77f, dy = 5.64f)
                // l 0.87 3.5
                lineToRelative(dx = 0.87f, dy = 3.5f)
                // h 0.14
                horizontalLineToRelative(dx = 0.14f)
                // l 0.9 -3.5z
                lineToRelative(dx = 0.9f, dy = -3.5f)
                close()
            }
            // <polygon points="14.2178 13.4658 14.1484 13.4658 12.9756 15.812 9.8477 21.4932 6.7891 15.835 5.5693 13.3052 5.501 13.3052 5.501 24.0 2.2119 24.0 2.2119 7.9458 5.915 7.9458 9.8477 15.4668 9.8936 15.4668 13.7812 7.9458 17.5068 7.9458 17.5068 24.0 14.2178 24.0 14.2178 13.4658" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.2178 13.4658
                moveTo(x = 14.2178f, y = 13.4658f)
                // L 14.1484 13.4658
                lineTo(x = 14.1484f, y = 13.4658f)
                // L 12.9756 15.812
                lineTo(x = 12.9756f, y = 15.812f)
                // L 9.8477 21.4932
                lineTo(x = 9.8477f, y = 21.4932f)
                // L 6.7891 15.835
                lineTo(x = 6.7891f, y = 15.835f)
                // L 5.5693 13.3052
                lineTo(x = 5.5693f, y = 13.3052f)
                // L 5.501 13.3052
                lineTo(x = 5.501f, y = 13.3052f)
                // L 5.501 24
                lineTo(x = 5.501f, y = 24.0f)
                // L 2.2119 24
                lineTo(x = 2.2119f, y = 24.0f)
                // L 2.2119 7.9458
                lineTo(x = 2.2119f, y = 7.9458f)
                // L 5.915 7.9458
                lineTo(x = 5.915f, y = 7.9458f)
                // L 9.8477 15.4668
                lineTo(x = 9.8477f, y = 15.4668f)
                // L 9.8936 15.4668
                lineTo(x = 9.8936f, y = 15.4668f)
                // L 13.7812 7.9458
                lineTo(x = 13.7812f, y = 7.9458f)
                // L 17.5068 7.9458
                lineTo(x = 17.5068f, y = 7.9458f)
                // L 17.5068 24
                lineTo(x = 17.5068f, y = 24.0f)
                // L 14.2178 24
                lineTo(x = 14.2178f, y = 24.0f)
                // L 14.2178 13.4658z
                lineTo(x = 14.2178f, y = 13.4658f)
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
        }.build().also { _mysql = it }
    }

@Suppress("ObjectPropertyName")
private var _mysql: ImageVector? = null
