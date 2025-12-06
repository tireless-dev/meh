package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CertificateCheck: ImageVector
    get() {
        val current = _certificateCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CertificateCheck",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="6" height="2" x="6.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="10" height="2" x="6.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="10" height="2" x="6.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // M14 26 H4 V6 h24 v10 h2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 26
                moveTo(x = 14.0f, y = 26.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
            }
            // <polygon points="22.0 25.59 19.41 23.0 18.0 24.41 22.0 28.41 30.0 20.41 28.59 19.0 22.0 25.59" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 25.59
                moveTo(x = 22.0f, y = 25.59f)
                // L 19.41 23
                lineTo(x = 19.41f, y = 23.0f)
                // L 18 24.41
                lineTo(x = 18.0f, y = 24.41f)
                // L 22 28.41
                lineTo(x = 22.0f, y = 28.41f)
                // L 30 20.41
                lineTo(x = 30.0f, y = 20.41f)
                // L 28.59 19
                lineTo(x = 28.59f, y = 19.0f)
                // L 22 25.59z
                lineTo(x = 22.0f, y = 25.59f)
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
        }.build().also { _certificateCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _certificateCheck: ImageVector? = null
