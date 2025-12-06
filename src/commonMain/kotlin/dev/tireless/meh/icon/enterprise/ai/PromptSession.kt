package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PromptSession: ImageVector
    get() {
        val current = _promptSession
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PromptSession",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="27.0 25.5859 25.0 23.5859 25.0 21.0 23.0 21.0 23.0 24.4141 25.5859 27.0 27.0 25.5859" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 25.5859
                moveTo(x = 27.0f, y = 25.5859f)
                // L 25 23.5859
                lineTo(x = 25.0f, y = 23.5859f)
                // L 25 21
                lineTo(x = 25.0f, y = 21.0f)
                // L 23 21
                lineTo(x = 23.0f, y = 21.0f)
                // L 23 24.4141
                lineTo(x = 23.0f, y = 24.4141f)
                // L 25.5859 27
                lineTo(x = 25.5859f, y = 27.0f)
                // L 27 25.5859z
                lineTo(x = 27.0f, y = 25.5859f)
                close()
            }
            // M24 31 a7 7 0 1 1 .02 -14.02 A7 7 0 0 1 24 31 m0 -12 a5 5 0 1 0 .01 10.01 A5 5 0 0 0 24 19 m4 -4 h2 V5 a2 2 0 0 0 -2 -2 h-3 v2 h3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 31
                moveTo(x = 24.0f, y = 31.0f)
                // a 7 7 0 1 1 0.02 -14.02
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.02f,
                    dy1 = -14.02f,
                )
                // A 7 7 0 0 1 24 31
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 31.0f,
                )
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // a 5 5 0 1 0 0.01 10.01
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.01f,
                    dy1 = 10.01f,
                )
                // A 5 5 0 0 0 24 19
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 19.0f,
                )
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
            }
            // <circle cx="9.0" cy="13.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="16.0" cy="13.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="23.0" cy="13.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7 23 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h3 v2 H4 v16 h3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 23
                moveTo(x = 7.0f, y = 23.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
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
        }.build().also { _promptSession = it }
    }

@Suppress("ObjectPropertyName")
private var _promptSession: ImageVector? = null
