package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ObservedHail: ImageVector
    get() {
        val current = _observedHail
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ObservedHail",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 18 A12 12 0 1 0 16 6 h-4 V1 L6 7 l6 6 V8 h4 A10 10 0 1 1 6 18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 18
                moveTo(x = 4.0f, y = 18.0f)
                // A 12 12 0 1 0 16 6
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 6.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 1
                verticalLineTo(y = 1.0f)
                // L 6 7
                lineTo(x = 6.0f, y = 7.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // A 10 10 0 1 1 6 18z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 18.0f,
                )
                close()
            }
            // <circle cx="13.5" cy="23.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13.5 23.5
                moveTo(x = 13.5f, y = 23.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="10.5" cy="19.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.5 19.5
                moveTo(x = 10.5f, y = 19.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="16.5" cy="19.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.5 19.5
                moveTo(x = 16.5f, y = 19.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <rect width="5" height="2" x="11.964" y="14.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.999671 16.586115
                moveTo(x = 11.999671f, y = 16.586115f)
                // l 3.535534 -3.535534
                lineToRelative(dx = 3.535534f, dy = -3.535534f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -3.535534 3.535534z
                lineToRelative(dx = -3.535534f, dy = 3.535534f)
                close()
            }
            // <rect width="5" height="2" x="17.964" y="14.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.999672 16.586115
                moveTo(x = 17.999672f, y = 16.586115f)
                // l 3.535534 -3.535534
                lineToRelative(dx = 3.535534f, dy = -3.535534f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -3.535534 3.535534z
                lineToRelative(dx = -3.535534f, dy = 3.535534f)
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
        }.build().also { _observedHail = it }
    }

@Suppress("ObjectPropertyName")
private var _observedHail: ImageVector? = null
