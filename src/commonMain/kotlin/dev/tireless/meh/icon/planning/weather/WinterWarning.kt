package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WinterWarning: ImageVector
    get() {
        val current = _winterWarning
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WinterWarning",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="21.684 19.051 19.167 19.891 13.0 15.486 13.0 7.369 15.555 5.665 14.445 4.001 12.0 5.631 9.555 4.001 8.445 5.665 11.0 7.369 11.0 14.057 6.0 10.486 6.0 8.0 4.0 8.0 4.0 10.279 1.684 11.051 2.316 12.949 4.833 12.11 10.28 16.001 4.833 19.891 2.316 19.051 1.684 20.949 4.0 21.721 4.0 24.0 6.0 24.0 6.0 21.515 11.0 17.944 11.0 24.631 8.445 26.335 9.555 27.999 12.0 26.368 14.445 27.999 15.555 26.335 13.0 24.631 13.0 17.943 18.0 21.515 18.0 24.0 20.0 24.0 20.0 21.721 22.316 20.949 21.684 19.051" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.684 19.051
                moveTo(x = 21.684f, y = 19.051f)
                // L 19.167 19.891
                lineTo(x = 19.167f, y = 19.891f)
                // L 13 15.486
                lineTo(x = 13.0f, y = 15.486f)
                // L 13 7.369
                lineTo(x = 13.0f, y = 7.369f)
                // L 15.555 5.665
                lineTo(x = 15.555f, y = 5.665f)
                // L 14.445 4.001
                lineTo(x = 14.445f, y = 4.001f)
                // L 12 5.631
                lineTo(x = 12.0f, y = 5.631f)
                // L 9.555 4.001
                lineTo(x = 9.555f, y = 4.001f)
                // L 8.445 5.665
                lineTo(x = 8.445f, y = 5.665f)
                // L 11 7.369
                lineTo(x = 11.0f, y = 7.369f)
                // L 11 14.057
                lineTo(x = 11.0f, y = 14.057f)
                // L 6 10.486
                lineTo(x = 6.0f, y = 10.486f)
                // L 6 8
                lineTo(x = 6.0f, y = 8.0f)
                // L 4 8
                lineTo(x = 4.0f, y = 8.0f)
                // L 4 10.279
                lineTo(x = 4.0f, y = 10.279f)
                // L 1.684 11.051
                lineTo(x = 1.684f, y = 11.051f)
                // L 2.316 12.949
                lineTo(x = 2.316f, y = 12.949f)
                // L 4.833 12.11
                lineTo(x = 4.833f, y = 12.11f)
                // L 10.28 16.001
                lineTo(x = 10.28f, y = 16.001f)
                // L 4.833 19.891
                lineTo(x = 4.833f, y = 19.891f)
                // L 2.316 19.051
                lineTo(x = 2.316f, y = 19.051f)
                // L 1.684 20.949
                lineTo(x = 1.684f, y = 20.949f)
                // L 4 21.721
                lineTo(x = 4.0f, y = 21.721f)
                // L 4 24
                lineTo(x = 4.0f, y = 24.0f)
                // L 6 24
                lineTo(x = 6.0f, y = 24.0f)
                // L 6 21.515
                lineTo(x = 6.0f, y = 21.515f)
                // L 11 17.944
                lineTo(x = 11.0f, y = 17.944f)
                // L 11 24.631
                lineTo(x = 11.0f, y = 24.631f)
                // L 8.445 26.335
                lineTo(x = 8.445f, y = 26.335f)
                // L 9.555 27.999
                lineTo(x = 9.555f, y = 27.999f)
                // L 12 26.368
                lineTo(x = 12.0f, y = 26.368f)
                // L 14.445 27.999
                lineTo(x = 14.445f, y = 27.999f)
                // L 15.555 26.335
                lineTo(x = 15.555f, y = 26.335f)
                // L 13 24.631
                lineTo(x = 13.0f, y = 24.631f)
                // L 13 17.943
                lineTo(x = 13.0f, y = 17.943f)
                // L 18 21.515
                lineTo(x = 18.0f, y = 21.515f)
                // L 18 24
                lineTo(x = 18.0f, y = 24.0f)
                // L 20 24
                lineTo(x = 20.0f, y = 24.0f)
                // L 20 21.721
                lineTo(x = 20.0f, y = 21.721f)
                // L 22.316 20.949
                lineTo(x = 22.316f, y = 20.949f)
                // L 21.684 19.051z
                lineTo(x = 21.684f, y = 19.051f)
                close()
            }
            // M23.75 10 h-1.5 V6 h1.5Z M23 11 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
            path {
                // M 23.75 10
                moveTo(x = 23.75f, y = 10.0f)
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 1.5z
                horizontalLineToRelative(dx = 1.5f)
                close()
                // M 23 11
                moveTo(x = 23.0f, y = 11.0f)
                // a 1 1 0 1 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M29.91 13.94 23.63 2.37 a.72 .72 0 0 0 -1.26 0 L16.1 13.94 A.72 .72 0 0 0 16.72 15 h12.56 a.72 .72 0 0 0 .63 -1.06 M22.25 6 h1.5 v4 h-1.5Z M23 13 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.91 13.94
                moveTo(x = 29.91f, y = 13.94f)
                // L 23.63 2.37
                lineTo(x = 23.63f, y = 2.37f)
                // a 0.72 0.72 0 0 0 -1.26 0
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.26f,
                    dy1 = 0.0f,
                )
                // L 16.1 13.94
                lineTo(x = 16.1f, y = 13.94f)
                // A 0.72 0.72 0 0 0 16.72 15
                arcTo(
                    horizontalEllipseRadius = 0.72f,
                    verticalEllipseRadius = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.72f,
                    y1 = 15.0f,
                )
                // h 12.56
                horizontalLineToRelative(dx = 12.56f)
                // a 0.72 0.72 0 0 0 0.63 -1.06
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.63f,
                    dy1 = -1.06f,
                )
                // M 22.25 6
                moveTo(x = 22.25f, y = 6.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -1.5z
                horizontalLineToRelative(dx = -1.5f)
                close()
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _winterWarning = it }
    }

@Suppress("ObjectPropertyName")
private var _winterWarning: ImageVector? = null
